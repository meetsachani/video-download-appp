package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class CrashlyticsFileMarker {
    public final String a;
    public final FileStore b;

    public CrashlyticsFileMarker(String str, FileStore fileStore) {
        this.a = str;
        this.b = fileStore;
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e) {
            Logger f = Logger.f();
            f.e("Error creating marker: " + this.a, e);
            return false;
        }
    }

    public final File b() {
        return this.b.f(this.a);
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
