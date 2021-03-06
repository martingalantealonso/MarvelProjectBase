package com.example.mgalante.marvelprojectbase.api.entities;


import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.List;

/**
 * Created by mgalante on 16/01/17.
 */

@DatabaseTable
public class Characters {

    @DatabaseField(columnName = "idCharacter", id = true)
    private int id;// (int, optional): The unique ID of the character resource.,
    @DatabaseField(columnName = "name")
    private String name; // (string, optional): The name of the character.,
    @DatabaseField(columnName = "description")
    private String description;//(string, optional): A short bio or description of the character.,
    private String modified;//(Date, optional): The date the resource was most recently modified.,
    @DatabaseField(columnName = "resourceURI")
    private String resourceURI;// (string, optional): The canonical URL identifier for this resource.,
    private List<Url> urls;//(Array[Url], optional): A set of public web site URLs for the resource.,
    private Image thumbnail;//(Image, optional): The representative image for this character.,
    //@DatabaseField(foreign = true,columnName = "comics")
    private ResourceList comics;//(ComicList, optional): A resource list containing comics which feature this character.,
    private ResourceList stories;//(StoryList, optional): A resource list of stories in which this character appears.,
    //@DatabaseField(foreign = true,columnName = "events")
    private ResourceList events;//(EventList, optional): A resource list of events in which this character appears.,
    private ResourceList series;//(SeriesList, optional): A resource list of series in which this character appears.

    @DatabaseField(columnName = "image")
    private String imageUrl;



    public Characters() {

    }

    public Characters(int id, String name, String description, String resourceURI, String imageUrl) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.resourceURI = resourceURI;
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public String getResourceURI() {
        return resourceURI;
    }

    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    public List<Url> getUrls() {
        return urls;
    }

    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

    public Image getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Image thumbnail) {
        this.thumbnail = thumbnail;
    }

    public ResourceList getComics() {
        return comics;
    }

    public void setComics(ResourceList comics) {
        this.comics = comics;
    }

    public ResourceList getStories() {
        return stories;
    }

    public void setStories(ResourceList stories) {
        this.stories = stories;
    }

    public ResourceList getEvents() {
        return events;
    }

    public void setEvents(ResourceList events) {
        this.events = events;
    }

    public ResourceList getSeries() {
        return series;
    }

    public void setSeries(ResourceList series) {
        this.series = series;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
