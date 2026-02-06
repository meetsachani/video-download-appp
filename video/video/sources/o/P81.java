package o;

import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface P81 {

    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static b a(@NotNull P81 p81) {
            return new b(p81);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        @NotNull
        public final P81 a;

        public b(@NotNull P81 p81) {
            C6562gT0.p(p81, "match");
            this.a = p81;
        }

        @XP0
        public final String a() {
            return k().b().get(1);
        }

        @XP0
        public final String b() {
            return k().b().get(10);
        }

        @XP0
        public final String c() {
            return k().b().get(2);
        }

        @XP0
        public final String d() {
            return k().b().get(3);
        }

        @XP0
        public final String e() {
            return k().b().get(4);
        }

        @XP0
        public final String f() {
            return k().b().get(5);
        }

        @XP0
        public final String g() {
            return k().b().get(6);
        }

        @XP0
        public final String h() {
            return k().b().get(7);
        }

        @XP0
        public final String i() {
            return k().b().get(8);
        }

        @XP0
        public final String j() {
            return k().b().get(9);
        }

        @NotNull
        public final P81 k() {
            return this.a;
        }

        @NotNull
        public final List<String> l() {
            return this.a.b().subList(1, this.a.b().size());
        }
    }

    @NotNull
    b a();

    @NotNull
    List<String> b();

    @NotNull
    C11197zR0 c();

    @NotNull
    N81 d();

    @NotNull
    String getValue();

    @Nullable
    P81 next();
}
