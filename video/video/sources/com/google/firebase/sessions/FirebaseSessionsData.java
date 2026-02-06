package com.google.firebase.sessions;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class FirebaseSessionsData {
    @Nullable
    public final String a;

    public FirebaseSessionsData(@Nullable String str) {
        this.a = str;
    }

    public static /* synthetic */ FirebaseSessionsData c(FirebaseSessionsData firebaseSessionsData, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = firebaseSessionsData.a;
        }
        return firebaseSessionsData.b(str);
    }

    @Nullable
    public final String a() {
        return this.a;
    }

    @NotNull
    public final FirebaseSessionsData b(@Nullable String str) {
        return new FirebaseSessionsData(str);
    }

    @Nullable
    public final String d() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FirebaseSessionsData) && C6562gT0.g(this.a, ((FirebaseSessionsData) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @NotNull
    public String toString() {
        return "FirebaseSessionsData(sessionId=" + this.a + ')';
    }
}
