package com.facebook.login;

import com.facebook.C0376a;
import java.util.Arrays;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes2.dex */
public enum L {
    FACEBOOK(C0376a.m1),
    INSTAGRAM(com.facebook.M.O);
    
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public final String X;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final L a(@Nullable String str) {
            L[] valuesCustom = L.valuesCustom();
            int length = valuesCustom.length;
            int i = 0;
            while (i < length) {
                L l = valuesCustom[i];
                i++;
                if (C6562gT0.g(l.toString(), str)) {
                    return l;
                }
            }
            return L.FACEBOOK;
        }

        public a() {
        }
    }

    L(String str) {
        this.X = str;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final L g(@Nullable String str) {
        return Y.a(str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static L[] valuesCustom() {
        L[] valuesCustom = values();
        return (L[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.X;
    }
}
