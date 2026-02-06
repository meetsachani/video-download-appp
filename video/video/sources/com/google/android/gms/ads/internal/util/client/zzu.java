package com.google.android.gms.ads.internal.util.client;

import android.net.TrafficStats;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzfqp;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import o.InterfaceC10697xN2;
import o.InterfaceC11300zs1;

/* loaded from: classes2.dex */
public final class zzu implements zze {
    @InterfaceC11300zs1
    public final String a;
    @InterfaceC11300zs1
    public String b;

    public zzu() {
        throw null;
    }

    @InterfaceC11300zs1
    public final String a() {
        return this.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0112, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.c() != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x00ed, code lost:
        if (com.google.android.gms.common.util.ClientLibraryUtils.c() != false) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00c0 A[RETURN] */
    @Override // com.google.android.gms.ads.internal.util.client.zze
    @InterfaceC10697xN2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzt w(String str) {
        HttpURLConnection httpURLConnection;
        zzt zztVar = zzt.PERMANENT_FAILURE;
        try {
            try {
                if (ClientLibraryUtils.c()) {
                    TrafficStats.setThreadStatsTag(263);
                }
                zzo.b("Pinging URL: " + str);
                URL url = new URI(str).toURL();
                int i = zzfqp.a;
                httpURLConnection = (HttpURLConnection) url.openConnection();
            } catch (IOException e) {
                e = e;
                String message = e.getMessage();
                zzo.g("Error while pinging URL: " + str + ". " + message);
                zztVar = zzt.RETRIABLE_FAILURE;
            } catch (IndexOutOfBoundsException e2) {
                e = e2;
                String message2 = e.getMessage();
                zzo.g("Error while parsing ping URL: " + str + ". " + message2);
            } catch (RuntimeException e3) {
                e = e3;
                String message3 = e.getMessage();
                zzo.g("Error while pinging URL: " + str + ". " + message3);
                zztVar = zzt.RETRIABLE_FAILURE;
            } catch (URISyntaxException e4) {
                e = e4;
                String message22 = e.getMessage();
                zzo.g("Error while parsing ping URL: " + str + ". " + message22);
            }
            try {
                zzbb.b();
                String str2 = this.a;
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setReadTimeout(60000);
                if (str2 != null) {
                    httpURLConnection.setRequestProperty("User-Agent", str2);
                }
                httpURLConnection.setUseCaches(false);
                zzl zzlVar = new zzl(null);
                zzlVar.c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                zzlVar.e(httpURLConnection, responseCode);
                if (responseCode >= 200 && responseCode < 300) {
                    if (((Boolean) zzbd.c().b(zzbcv.d8)).booleanValue()) {
                        this.b = httpURLConnection.getHeaderField("X-Afma-Ad-Event-Value");
                    }
                    zztVar = zzt.SUCCESS;
                    httpURLConnection.disconnect();
                    if (!ClientLibraryUtils.c()) {
                        return zztVar;
                    }
                    TrafficStats.clearThreadStatsTag();
                    return zztVar;
                }
                zzo.g("Received non-success response code " + responseCode + " from pinging URL: " + str);
                if (responseCode == 502) {
                    zztVar = zzt.RETRIABLE_FAILURE;
                }
                httpURLConnection.disconnect();
                if (!ClientLibraryUtils.c()) {
                }
                TrafficStats.clearThreadStatsTag();
                return zztVar;
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th2) {
            if (ClientLibraryUtils.c()) {
                TrafficStats.clearThreadStatsTag();
            }
            throw th2;
        }
    }

    public zzu(@InterfaceC11300zs1 String str) {
        this.a = str;
    }
}
