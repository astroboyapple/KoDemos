package cn.vszone.ko.common.download;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;

/**
 * Created by Astroboy on 2017/3/3.
 */

class KoDownloadManager {
    private static final KoDownloadManager ourInstance = new KoDownloadManager();

    static KoDownloadManager getInstance() {
        return ourInstance;
    }

    private KoDownloadManager() {
    }

    public void download(Context pContext){
        Uri uri= Uri.parse("");
        DownloadManager.Request request=new DownloadManager.Request(uri);
        DownloadManager downloadManager= (DownloadManager) pContext.getSystemService(Context.DOWNLOAD_SERVICE);
        downloadManager.enqueue(request);}
}
