package com.facebook;

import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public final class P extends C2416z {
    @NotNull
    public static final a Z = new a(null);
    private static final long serialVersionUID = 1;
    @NotNull
    public final C Y;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public P(@NotNull C c, @Nullable String str) {
        super(str);
        C6562gT0.p(c, "requestError");
        this.Y = c;
    }

    @NotNull
    public final C c() {
        return this.Y;
    }

    @Override // com.facebook.C2416z, java.lang.Throwable
    @NotNull
    public String toString() {
        String str = "{FacebookServiceException: httpResponseCode: " + this.Y.u() + ", facebookErrorCode: " + this.Y.g() + ", facebookErrorType: " + this.Y.m() + ", message: " + this.Y.h() + "}";
        C6562gT0.o(str, "StringBuilder()\n        .append(\"{FacebookServiceException: \")\n        .append(\"httpResponseCode: \")\n        .append(requestError.requestStatusCode)\n        .append(\", facebookErrorCode: \")\n        .append(requestError.errorCode)\n        .append(\", facebookErrorType: \")\n        .append(requestError.errorType)\n        .append(\", message: \")\n        .append(requestError.errorMessage)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
