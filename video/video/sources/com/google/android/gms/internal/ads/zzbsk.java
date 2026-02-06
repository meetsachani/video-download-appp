package com.google.android.gms.internal.ads;

import android.app.DownloadManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Environment;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzbsk implements DialogInterface.OnClickListener {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ zzbsm Z;

    public zzbsk(zzbsm zzbsmVar, String str, String str2) {
        this.X = str;
        this.Y = str2;
        this.Z = zzbsmVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        Context context;
        context = this.Z.d;
        DownloadManager downloadManager = (DownloadManager) context.getSystemService("download");
        try {
            String str = this.X;
            String str2 = this.Y;
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
            request.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, str2);
            com.google.android.gms.ads.internal.zzv.v();
            request.allowScanningByMediaScanner();
            request.setNotificationVisibility(1);
            downloadManager.enqueue(request);
        } catch (IllegalStateException unused) {
            this.Z.c("Could not store picture.");
        }
    }
}
