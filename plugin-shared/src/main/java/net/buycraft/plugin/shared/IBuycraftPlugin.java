package net.buycraft.plugin.shared;

import net.buycraft.plugin.IBuycraftPlatform;
import net.buycraft.plugin.client.ApiClient;
import net.buycraft.plugin.data.responses.ServerInformation;
import net.buycraft.plugin.execution.DuePlayerFetcher;
import net.buycraft.plugin.shared.config.BuycraftConfiguration;
import net.buycraft.plugin.shared.tasks.ListingUpdateTask;
import okhttp3.OkHttpClient;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.file.Path;

public interface IBuycraftPlugin {
    IBuycraftPlatform getPlatform();

    OkHttpClient getHttpClient();

    BuycraftConfiguration getConfiguration();

    DuePlayerFetcher getDuePlayerFetcher();

    ListingUpdateTask getListingUpdateTask();

    boolean isOnlineMode();

    InetSocketAddress getAddress();

    Path getBasePath();

    void saveConfiguration() throws IOException;

    void setApiClient(ApiClient client);

    void setServerInformation(ServerInformation information);
}
