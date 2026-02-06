package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.HashMap;
import o.SQ0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzcdh implements Runnable {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Y0;
    public final /* synthetic */ String Z;
    public final /* synthetic */ zzcdi Z0;

    public zzcdh(zzcdi zzcdiVar, String str, String str2, String str3, String str4) {
        this.X = str;
        this.Y = str2;
        this.Z = str3;
        this.Y0 = str4;
        this.Z0 = zzcdiVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheCanceled");
        hashMap.put("src", this.X);
        String str = this.Y;
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("cachedSrc", str);
        }
        String str2 = this.Z;
        switch (str2.hashCode()) {
            case -1947652542:
                if (str2.equals("interrupted")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3387234:
                if (str2.equals("noop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str2.equals("error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        String str3 = "internal";
        switch (c) {
            case 6:
            case 7:
                str3 = "io";
                break;
            case '\b':
            case '\t':
                str3 = "network";
                break;
            case '\n':
            case 11:
                str3 = "policy";
                break;
        }
        hashMap.put("type", str3);
        hashMap.put(SQ0.n, str2);
        String str4 = this.Y0;
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("message", str4);
        }
        zzcdi.k(this.Z0, "onPrecacheEvent", hashMap);
    }
}
