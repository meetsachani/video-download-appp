package com.google.firebase.platforminfo;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes3.dex */
public class GlobalLibraryVersionRegistrar {
    public static volatile GlobalLibraryVersionRegistrar b;
    public final Set<LibraryVersion> a = new HashSet();

    public static GlobalLibraryVersionRegistrar a() {
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar;
        GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar2 = b;
        if (globalLibraryVersionRegistrar2 == null) {
            synchronized (GlobalLibraryVersionRegistrar.class) {
                try {
                    globalLibraryVersionRegistrar = b;
                    if (globalLibraryVersionRegistrar == null) {
                        globalLibraryVersionRegistrar = new GlobalLibraryVersionRegistrar();
                        b = globalLibraryVersionRegistrar;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return globalLibraryVersionRegistrar;
        }
        return globalLibraryVersionRegistrar2;
    }

    public Set<LibraryVersion> b() {
        Set<LibraryVersion> unmodifiableSet;
        synchronized (this.a) {
            unmodifiableSet = Collections.unmodifiableSet(this.a);
        }
        return unmodifiableSet;
    }

    public void c(String str, String str2) {
        synchronized (this.a) {
            this.a.add(LibraryVersion.a(str, str2));
        }
    }
}
