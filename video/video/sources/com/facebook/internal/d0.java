package com.facebook.internal;

import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import o.C6562gT0;
import o.C9516sY;
import o.InterfaceC9511sW0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum d0 {
    None(0),
    Enabled(1),
    RequireConfirm(2);
    
    @NotNull
    public static final a Y = new a(null);
    @NotNull
    public static final EnumSet<d0> Z;
    public final long X;

    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @InterfaceC9511sW0
        @NotNull
        public final EnumSet<d0> a(long j) {
            EnumSet<d0> noneOf = EnumSet.noneOf(d0.class);
            Iterator it = d0.Z.iterator();
            while (it.hasNext()) {
                d0 d0Var = (d0) it.next();
                if ((d0Var.h() & j) != 0) {
                    noneOf.add(d0Var);
                }
            }
            C6562gT0.o(noneOf, "result");
            return noneOf;
        }

        public a() {
        }
    }

    static {
        EnumSet<d0> allOf = EnumSet.allOf(d0.class);
        C6562gT0.o(allOf, "allOf(SmartLoginOption::class.java)");
        Z = allOf;
    }

    d0(long j) {
        this.X = j;
    }

    @InterfaceC9511sW0
    @NotNull
    public static final EnumSet<d0> i(long j) {
        return Y.a(j);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static d0[] valuesCustom() {
        d0[] valuesCustom = values();
        return (d0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final long h() {
        return this.X;
    }
}
