package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@InterfaceC8303na2({"SMAP\nTypeParameterReference.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeParameterReference.kt\nkotlin/jvm/internal/TypeParameterReference\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,58:1\n1#2:59\n*E\n"})
@InterfaceC6480g82(version = "1.4")
/* loaded from: classes3.dex */
public final class Fv2 implements ZW0 {
    @NotNull
    public static final a a1 = new a(null);
    @Nullable
    public final Object X;
    @NotNull
    public final String Y;
    public final boolean Y0;
    @NotNull
    public final EnumC5350bX0 Z;
    @Nullable
    public volatile List<? extends XW0> Z0;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: o.Fv2$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public /* synthetic */ class C0185a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC5350bX0.values().length];
                try {
                    iArr[EnumC5350bX0.X.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC5350bX0.Y.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC5350bX0.Z.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                a = iArr;
            }
        }

        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        @NotNull
        public final String a(@NotNull ZW0 zw0) {
            C6562gT0.p(zw0, "typeParameter");
            StringBuilder sb = new StringBuilder();
            int i = C0185a.a[zw0.j().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        sb.append("out ");
                    } else {
                        throw new C3865Oq1();
                    }
                } else {
                    sb.append("in ");
                }
            } else {
                C7458kA2 c7458kA2 = C7458kA2.a;
            }
            sb.append(zw0.getName());
            return sb.toString();
        }

        public a() {
        }
    }

    public Fv2(@Nullable Object obj, @NotNull String str, @NotNull EnumC5350bX0 enumC5350bX0, boolean z) {
        C6562gT0.p(str, "name");
        C6562gT0.p(enumC5350bX0, "variance");
        this.X = obj;
        this.Y = str;
        this.Z = enumC5350bX0;
        this.Y0 = z;
    }

    public final void b(@NotNull List<? extends XW0> list) {
        C6562gT0.p(list, "upperBounds");
        if (this.Z0 == null) {
            this.Z0 = list;
            return;
        }
        throw new IllegalStateException(("Upper bounds of type parameter '" + this + "' have already been initialized.").toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof Fv2) {
            Fv2 fv2 = (Fv2) obj;
            if (C6562gT0.g(this.X, fv2.X) && C6562gT0.g(getName(), fv2.getName())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // o.ZW0
    @NotNull
    public String getName() {
        return this.Y;
    }

    @Override // o.ZW0
    @NotNull
    public List<XW0> getUpperBounds() {
        List list = this.Z0;
        if (list == null) {
            List<XW0> k = C7979mF.k(C6551gQ1.n(Object.class));
            this.Z0 = k;
            return k;
        }
        return list;
    }

    public int hashCode() {
        int i;
        Object obj = this.X;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + getName().hashCode();
    }

    @Override // o.ZW0
    public boolean i() {
        return this.Y0;
    }

    @Override // o.ZW0
    @NotNull
    public EnumC5350bX0 j() {
        return this.Z;
    }

    @NotNull
    public String toString() {
        return a1.a(this);
    }

    public static /* synthetic */ void a() {
    }
}
