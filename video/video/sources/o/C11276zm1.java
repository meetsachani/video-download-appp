package o;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: o.zm1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11276zm1 extends Thread {
    public Context X;
    public final DownloadManager Y;
    public final DownloadManager.Request Y0;
    public final String Z;
    public String Z0;
    public String a1;

    public C11276zm1(DownloadManager.Request request, DownloadManager downloadManager, String str, String str2, String str3, Context context) {
        C6562gT0.p(request, "request");
        C6562gT0.p(downloadManager, "downloadManager");
        C6562gT0.p(str, "downloadUrl");
        C6562gT0.p(str2, "title");
        C6562gT0.p(str3, "thumb");
        C6562gT0.p(context, "context");
        this.Y0 = request;
        this.Y = downloadManager;
        this.Z = str;
        this.a1 = str2;
        this.Z0 = str3;
        this.X = context;
    }

    public Context a() {
        return this.X;
    }

    public String b() {
        return this.Z0;
    }

    public String c() {
        return this.a1;
    }

    public void d(Context context) {
        C6562gT0.p(context, "<set-?>");
        this.X = context;
    }

    public void e(String str) {
        C6562gT0.p(str, "<set-?>");
        this.Z0 = str;
    }

    public void f(String str) {
        C6562gT0.p(str, "<set-?>");
        this.a1 = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        long enqueue = this.Y.enqueue(this.Y0);
        if (enqueue != 0) {
            GF2 gf2 = GF2.a;
            Intent intent = new Intent(gf2.a());
            intent.putExtra(gf2.b(), String.valueOf(enqueue));
            Log.d("DATALIST", "YES: THREAD");
            try {
                Context context = this.X;
                if (context != null) {
                    context.sendBroadcast(intent);
                }
            } catch (Exception e) {
                Log.d("CrashINTHREAD", String.valueOf(e.getMessage()));
            }
        }
    }
}
