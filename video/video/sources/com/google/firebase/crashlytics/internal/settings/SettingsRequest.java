package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.InstallIdProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SettingsRequest {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final InstallIdProvider e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    public SettingsRequest(String str, String str2, String str3, String str4, InstallIdProvider installIdProvider, String str5, String str6, String str7, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = installIdProvider;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i;
    }
}
