package o;

import android.content.ContentProvider;
import android.content.Context;

/* renamed from: o.jM  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7260jM {
    public static Context a(ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}
