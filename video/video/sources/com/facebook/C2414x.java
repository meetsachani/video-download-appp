package com.facebook;

import o.C6562gT0;
import o.C9516sY;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.facebook.x  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2414x extends C2416z {
    @NotNull
    public static final a Y0 = new a(null);
    public static final long serialVersionUID = 1;
    public final int Y;
    @Nullable
    public final String Z;

    /* renamed from: com.facebook.x$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C2414x(@Nullable String str, int i, @Nullable String str2) {
        super(str);
        this.Y = i;
        this.Z = str2;
    }

    public final int c() {
        return this.Y;
    }

    @Nullable
    public final String d() {
        return this.Z;
    }

    @Override // com.facebook.C2416z, java.lang.Throwable
    @NotNull
    public String toString() {
        String str = "{FacebookDialogException: errorCode: " + this.Y + ", message: " + getMessage() + ", url: " + this.Z + "}";
        C6562gT0.o(str, "StringBuilder()\n        .append(\"{FacebookDialogException: \")\n        .append(\"errorCode: \")\n        .append(errorCode)\n        .append(\", message: \")\n        .append(message)\n        .append(\", url: \")\n        .append(failingUrl)\n        .append(\"}\")\n        .toString()");
        return str;
    }
}
