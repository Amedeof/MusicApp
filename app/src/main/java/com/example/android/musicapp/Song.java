package com.example.android.musicapp;

import android.media.Image;
import android.widget.ImageView;

/**
 * {@link Song} This class defines the content of each item in the grid view.
 */

public class Song {

    /**Song Title
     */
    private String mSongTitle;

    /**Album title
     */
    private String mAlbumTitle;

    /**Album's image
     */
    private int mAlbumImage;

    /**create a new Song object
     *
     *@param vSongTitle is the title of the song user wants to play
     *@param vAlbumTitle is the album which the song belongs to
     *@param AlbumImage is the picture of the album
    */
    public Song(String vSongTitle, String vAlbumTitle, int AlbumImage){
        mSongTitle = vSongTitle;
        mAlbumTitle = vAlbumTitle;
        mAlbumImage = AlbumImage;
    }

    /**Get the title of the song
     *
     * @return SongTitle
     */
    public String getSongTitle(){
        return mSongTitle;
    }

    /**Get the title of the album
     *
     * @return AlbumTitle
     */
    public String getAlbumTitle(){
        return mAlbumTitle;
    }

    /**Get the image of the album
     *
     * @return AlbumImage
     */
    public int getAlbumImage(){
        return mAlbumImage;
    }
}
