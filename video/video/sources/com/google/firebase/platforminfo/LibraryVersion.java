package com.google.firebase.platforminfo;

import o.InterfaceC6615gi;
import o.InterfaceC7866lr1;

/* JADX INFO: Access modifiers changed from: package-private */
@InterfaceC6615gi
/* loaded from: classes3.dex */
public abstract class LibraryVersion {
    public static LibraryVersion a(String str, String str2) {
        return new AutoValue_LibraryVersion(str, str2);
    }

    @InterfaceC7866lr1
    public abstract String b();

    @InterfaceC7866lr1
    public abstract String c();
}
