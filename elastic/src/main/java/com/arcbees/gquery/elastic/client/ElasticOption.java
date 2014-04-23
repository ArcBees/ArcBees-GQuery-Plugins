package com.arcbees.gquery.elastic.client;

public class ElasticOption {

    private int columnWidth;
    private int minNumberColumn;
    private int maxNumberColumn;
    private int innerColumnMargin;
    private int innerRowMargin;
    private boolean autoResize;

    public ElasticOption() {
        setDefaults();
    }

    public ElasticOption withColumWidth(int columnWidth) {
        this.columnWidth = columnWidth;
        return this;
    }

    /**
     * Set the minimal number of columsn to display.
     * Default: 1
     */
    public ElasticOption withMinimalNumberOfColumn(int minNumberColumn) {
        this.minNumberColumn = minNumberColumn;
        return this;
    }

    /**
     * Set the space between each columns in px. If you want to set outer margin,
     * just set padding on the items container.
     * Default: 10px
     */
    public ElasticOption withInnerColumnMargin(int innerMargin) {
        this.innerColumnMargin = innerMargin;
        return this;
    }

    /**
     * Set the space between each rows in px. If you want to set outer margin,
     * just set padding on the items container.
     * Default: 10px
     */
    public ElasticOption withInnerRowMargin(int innerMargin) {
        this.innerRowMargin = innerColumnMargin;
        return this;
    }

    /**
     * Set the maximum number of columns to display.
     * Default: infinity
     */
    public ElasticOption withMaximalNumberOfColumn(int maxNumberColumn) {
        this.maxNumberColumn = maxNumberColumn;
        return this;
    }

    /**
     * In autoResize mode, the plugin will automatically recompute the layout when the user is resizing the page.
     * Default: true
     */
    public ElasticOption withAutoResize(boolean autoResize) {
        this.autoResize = autoResize;
        return this;
    }

    public int getColumnWidth() {
        return columnWidth;
    }

    public int getMinimalNumberOfColumn() {
        return minNumberColumn;
    }

    public int getMaximalNumberOfColumn() {
        return maxNumberColumn;
    }

    public int getInnerColumnMargin() {
        return innerColumnMargin;
    }

    public int getInnerRowMargin() {
        return innerRowMargin;
    }

    public boolean isAutoResize() {
        return autoResize;
    }

    private void setDefaults() {
        columnWidth = 250;
        minNumberColumn = 1;
        maxNumberColumn = Integer.MAX_VALUE;
        innerColumnMargin = 10;
        innerRowMargin = 10;
        autoResize = true;
    }
}
