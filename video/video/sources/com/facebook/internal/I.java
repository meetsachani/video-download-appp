package com.facebook.internal;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class I {
    @Nullable
    public Fragment a;
    @Nullable
    public android.app.Fragment b;

    public I(@NotNull Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        this.a = fragment;
    }

    @Nullable
    public final Activity a() {
        Fragment fragment = this.a;
        if (fragment != null) {
            if (fragment == null) {
                return null;
            }
            return fragment.o();
        }
        android.app.Fragment fragment2 = this.b;
        if (fragment2 == null) {
            return null;
        }
        return fragment2.getActivity();
    }

    @Nullable
    public final android.app.Fragment b() {
        return this.b;
    }

    @Nullable
    public final Fragment c() {
        return this.a;
    }

    public final void d(@Nullable Intent intent, int i) {
        Fragment fragment = this.a;
        if (fragment != null) {
            if (fragment != null) {
                fragment.startActivityForResult(intent, i);
                return;
            }
            return;
        }
        android.app.Fragment fragment2 = this.b;
        if (fragment2 == null) {
            return;
        }
        fragment2.startActivityForResult(intent, i);
    }

    public I(@NotNull android.app.Fragment fragment) {
        C6562gT0.p(fragment, "fragment");
        this.b = fragment;
    }
}
