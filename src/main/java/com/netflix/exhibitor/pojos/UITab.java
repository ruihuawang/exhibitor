package com.netflix.exhibitor.pojos;

/**
 * Used to add additional tabs to the Exhibitor UI
 */
public class UITab
{
    private final String        name;
    private final String        content;

    public UITab()
    {
        name = "";
        content = "";
    }

    public UITab(String name)
    {
        this.name = name;
        content = "";
    }

    public UITab(String name, String content)
    {
        this.name = name;
        this.content = content;
    }

    /**
     * Return the tab name
     *
     * @return name
     */
    public String       getName()
    {
        return name;
    }

    /**
     * Return the content (as text/plain) for the tab
     * @return content
     * @throws Exception errors
     */
    public String       getContent() throws Exception
    {
        return content;
    }
}
