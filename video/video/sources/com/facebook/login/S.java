package com.facebook.login;

import android.app.Activity;
import android.content.Intent;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public interface S {
    @Nullable
    Activity a();

    void startActivityForResult(@NotNull Intent intent, int i);
}
