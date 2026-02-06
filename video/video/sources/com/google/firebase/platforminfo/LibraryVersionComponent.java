package com.google.firebase.platforminfo;

import android.content.Context;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Dependency;
import com.google.firebase.platforminfo.LibraryVersion;

/* loaded from: classes3.dex */
public class LibraryVersionComponent {

    /* loaded from: classes3.dex */
    public interface VersionExtractor<T> {
        String a(T t);
    }

    private LibraryVersionComponent() {
    }

    public static Component<?> b(String str, String str2) {
        return Component.p(LibraryVersion.a(str, str2), LibraryVersion.class);
    }

    public static Component<?> c(final String str, final VersionExtractor<Context> versionExtractor) {
        return Component.r(LibraryVersion.class).b(Dependency.m(Context.class)).f(new ComponentFactory() { // from class: o.BZ0
            @Override // com.google.firebase.components.ComponentFactory
            public final Object a(ComponentContainer componentContainer) {
                LibraryVersion a;
                a = LibraryVersion.a(str, versionExtractor.a((Context) componentContainer.a(Context.class)));
                return a;
            }
        }).d();
    }
}
