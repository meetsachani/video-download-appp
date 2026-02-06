package com.google.firebase.sessions.settings;

import o.C7458kA2;
import o.HM;
import o.Y70;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface SettingsProvider {

    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static boolean a(@NotNull SettingsProvider settingsProvider) {
            return false;
        }

        @Nullable
        public static Object b(@NotNull SettingsProvider settingsProvider, @NotNull HM<? super C7458kA2> hm) {
            return C7458kA2.a;
        }
    }

    @Nullable
    Boolean a();

    @Nullable
    Y70 b();

    @Nullable
    Double c();

    @Nullable
    Object d(@NotNull HM<? super C7458kA2> hm);

    boolean e();
}
