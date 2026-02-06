package com.facebook;

import o.C4500Ve2;
import o.C6562gT0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class A extends C2416z {
    @Nullable
    public final Y Y;

    public A(@Nullable Y y, @Nullable String str) {
        super(str);
        this.Y = y;
    }

    @Nullable
    public final Y c() {
        return this.Y;
    }

    @Override // com.facebook.C2416z, java.lang.Throwable
    @NotNull
    public String toString() {
        C g;
        Y y = this.Y;
        if (y == null) {
            g = null;
        } else {
            g = y.g();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookGraphResponseException: ");
        String message = getMessage();
        if (message != null) {
            sb.append(message);
            sb.append(C4500Ve2.b);
        }
        if (g != null) {
            sb.append("httpResponseCode: ");
            sb.append(g.u());
            sb.append(", facebookErrorCode: ");
            sb.append(g.g());
            sb.append(", facebookErrorType: ");
            sb.append(g.m());
            sb.append(", message: ");
            sb.append(g.h());
            sb.append("}");
        }
        String sb2 = sb.toString();
        C6562gT0.o(sb2, "errorStringBuilder.toString()");
        return sb2;
    }
}
