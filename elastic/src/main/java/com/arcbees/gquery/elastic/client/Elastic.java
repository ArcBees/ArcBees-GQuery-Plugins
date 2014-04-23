package com.arcbees.gquery.elastic.client;

import com.google.gwt.dom.client.Element;
import com.google.gwt.query.client.GQuery;
import com.google.gwt.query.client.plugins.Plugin;

public class Elastic extends GQuery {
    public static final Class<Elastic> Elastic = GQuery.registerPlugin(Elastic.class, new Plugin<Elastic>() {
        public Elastic init(GQuery gq) {
            return new Elastic(gq);
        }
    });
    static String ELASTIC_DATA_KEY = "__GQUERY_ARCBEES_ELASTIC";

    public Elastic(GQuery gq) {
        super(gq);
    }

    private static boolean isSupported() {
        return !GQuery.browser.ie6 && !GQuery.browser.ie8;
    }

    public Elastic elastic() {
        return elastic(new ElasticOption());
    }

    public Elastic elastic(ElasticOption options) {
        for (Element e : elements()) {
            GQuery $e = $(e);
            if (isSupported() && $e.data(ELASTIC_DATA_KEY) == null) {
                ElasticImpl impl = new ElasticImpl(e, options);
                $e.data(ELASTIC_DATA_KEY, impl);
            }
        }
        return this;
    }

    public Elastic destroy() {
        for (Element e : elements()) {
            ElasticImpl impl = getImpl(e);
            if (impl != null) {
                impl.destroy();
            }
        }
        return this;
    }

    public Elastic updateLayout() {
        for (Element e : elements()) {
            ElasticImpl impl = getImpl(e);
            if (impl != null) {
                impl.update();
            }
        }
        return this;
    }

    private ElasticImpl getImpl(Element e) {
        return $(e).data(ELASTIC_DATA_KEY, ElasticImpl.class);
    }

}
