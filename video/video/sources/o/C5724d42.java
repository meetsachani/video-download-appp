package o;

import android.content.SharedPreferences;

/* renamed from: o.d42  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5724d42 {
    public static final void a(SharedPreferences sharedPreferences, boolean z, HA0<? super SharedPreferences.Editor, C7458kA2> ha0) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        ha0.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void b(SharedPreferences sharedPreferences, boolean z, HA0 ha0, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        ha0.invoke(edit);
        if (z) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
