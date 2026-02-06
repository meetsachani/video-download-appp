package o;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.Serializable;
import java.lang.Enum;
import org.jetbrains.annotations.NotNull;

/* renamed from: o.Ld0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3519Ld0<E extends Enum<E>> implements Serializable {
    @NotNull
    public static final a Y = new a(null);
    private static final long serialVersionUID = 0;
    @NotNull
    public final Class<E> X;

    /* renamed from: o.Ld0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public a() {
        }
    }

    public C3519Ld0(@NotNull E[] eArr) {
        C6562gT0.p(eArr, RemoteConfigConstants.ResponseFieldKey.h0);
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        C6562gT0.m(cls);
        this.X = cls;
    }

    private final Object readResolve() {
        E[] enumConstants = this.X.getEnumConstants();
        C6562gT0.o(enumConstants, "getEnumConstants(...)");
        return C3323Jd0.c(enumConstants);
    }
}
