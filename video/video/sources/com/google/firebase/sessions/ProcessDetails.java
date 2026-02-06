package com.google.firebase.sessions;

import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ProcessDetails {
    @NotNull
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public ProcessDetails(@NotNull String str, int i, int i2, boolean z) {
        C6562gT0.p(str, "processName");
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public static /* synthetic */ ProcessDetails f(ProcessDetails processDetails, String str, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = processDetails.a;
        }
        if ((i3 & 2) != 0) {
            i = processDetails.b;
        }
        if ((i3 & 4) != 0) {
            i2 = processDetails.c;
        }
        if ((i3 & 8) != 0) {
            z = processDetails.d;
        }
        return processDetails.e(str, i, i2, z);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    @NotNull
    public final ProcessDetails e(@NotNull String str, int i, int i2, boolean z) {
        C6562gT0.p(str, "processName");
        return new ProcessDetails(str, i, i2, z);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProcessDetails) {
            ProcessDetails processDetails = (ProcessDetails) obj;
            return C6562gT0.g(this.a, processDetails.a) && this.b == processDetails.b && this.c == processDetails.c && this.d == processDetails.d;
        }
        return false;
    }

    public final int g() {
        return this.c;
    }

    public final int h() {
        return this.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.a.hashCode() * 31) + Integer.hashCode(this.b)) * 31) + Integer.hashCode(this.c)) * 31;
        boolean z = this.d;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        return hashCode + i;
    }

    @NotNull
    public final String i() {
        return this.a;
    }

    public final boolean j() {
        return this.d;
    }

    @NotNull
    public String toString() {
        return "ProcessDetails(processName=" + this.a + ", pid=" + this.b + ", importance=" + this.c + ", isDefaultProcess=" + this.d + ')';
    }
}
