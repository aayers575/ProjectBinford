package com.nashss.se.musicplaylistservice.dependency;

import com.nashss.se.musicplaylistservice.activity.AddSongToPlaylistActivity;
import com.nashss.se.musicplaylistservice.activity.CreatePlaylistActivity;
import com.nashss.se.musicplaylistservice.activity.GetPlaylistActivity;
import com.nashss.se.musicplaylistservice.activity.GetPlaylistSongsActivity;
import com.nashss.se.musicplaylistservice.activity.SearchPlaylistsActivity;
import com.nashss.se.musicplaylistservice.activity.UpdatePlaylistActivity;

import com.nashss.se.musicplaylistservice.activity.material.CreateMaterialActivity;
import com.nashss.se.musicplaylistservice.activity.material.GetOrgMaterialsActivity;
import com.nashss.se.musicplaylistservice.activity.material.GetSingleMaterialActivity;
import dagger.Component;

import javax.inject.Singleton;

/**
 * Dagger component for providing dependency injection in the Music Playlist Service.
 */
@Singleton
@Component(modules = {DaoModule.class, MetricsModule.class})
public interface ServiceComponent {

    /**
     * Provides the relevant activity.
     * @return AddSongToPlaylistActivity
     */
    AddSongToPlaylistActivity provideAddSongToPlaylistActivity();

    /**
     * Provides the relevant activity.
     * @return CreatePlaylistActivity
     */
    CreatePlaylistActivity provideCreatePlaylistActivity();

    /**
     * Provides the relevant activity.
     * @return GetPlaylistActivity
     */
    GetPlaylistActivity provideGetPlaylistActivity();

    /**
     * Provides the relevant activity.
     * @return GetPlaylistActivity
     */
    SearchPlaylistsActivity provideSearchPlaylistsActivity();

    /**
     * Provides the relevant activity.
     * @return GetPlaylistSongsActivity
     */
    GetPlaylistSongsActivity provideGetPlaylistSongsActivity();

    /**
     * Provides the relevant activity.
     * @return UpdatePlaylistActivity
     */
    UpdatePlaylistActivity provideUpdatePlaylistActivity();

    /**
     * Provides the relevant activity.
     * @return GetSingleMaterialActivity
     */
    GetSingleMaterialActivity provideGetSingleMaterialActivity();

    /**
     * Provides the relevant activity.
     * @return GetOrgMaterialsActivity
     */
    GetOrgMaterialsActivity provideGetOrgMaterialsActivity();

    /**
     * Provides the relevant activity.
     * @return CreateMaterialsActivity
     */
    CreateMaterialActivity provideCreateMaterialActivity();

}
