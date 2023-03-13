package com.innova.musicplayergo.ui

import com.innova.musicplayergo.models.Music

interface MediaControlInterface {
    fun onSongSelected(song: Music?, songs: List<Music>?, songLaunchedBy: String)
    fun onSongsShuffled(songs: List<Music>?, songLaunchedBy: String)
    fun onAddToQueue(song: Music?)
    // first: force play, second: restore song
    fun onAddAlbumToQueue(songs: List<Music>?, forcePlay: Pair<Boolean, Music?>)
    fun onUpdatePlayingAlbumSongs(songs: List<Music>?)
    fun onPlaybackSpeedToggled()
    fun onHandleCoverOptionsUpdate()
    fun onUpdatePositionFromNP(position: Int)
}
