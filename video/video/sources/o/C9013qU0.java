package o;

import java.time.Instant;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: o.qU0  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C9013qU0 extends C8040mU0 {

    @InterfaceC8303na2({"SMAP\nJDK8PlatformImplementations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JDK8PlatformImplementations.kt\nkotlin/internal/jdk8/JDK8PlatformImplementations$ReflectSdkVersion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,76:1\n1#2:77\n*E\n"})
    /* renamed from: o.qU0$a */
    /* loaded from: classes3.dex */
    public static final class a {
        @NotNull
        public static final a a = new a();
        @InterfaceC7058iW0
        @Nullable
        public static final Integer b;

        static {
            Integer num;
            Object obj;
            Integer num2 = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            if (obj instanceof Integer) {
                num = (Integer) obj;
                if (num != null && num.intValue() > 0) {
                    num2 = num;
                }
                b = num2;
            }
            num = null;
            if (num != null) {
                num2 = num;
            }
            b = num2;
        }
    }

    /* renamed from: o.qU0$b */
    /* loaded from: classes3.dex */
    public static final class b implements MD {
        @Override // o.MD
        public C11193zQ0 a() {
            Instant now;
            now = Instant.now();
            C6562gT0.o(now, "now(...)");
            return DQ0.b(now);
        }
    }

    /* renamed from: o.qU0$c */
    /* loaded from: classes3.dex */
    public static final class c implements MD {
        @Override // o.MD
        public C11193zQ0 a() {
            return C11193zQ0.Z.a(System.currentTimeMillis());
        }
    }

    @Override // o.C8946qD1
    @NotNull
    public AbstractC10696xN1 b() {
        if (f(34)) {
            return new C10167vD1();
        }
        return super.b();
    }

    @Override // o.C8946qD1
    @Nullable
    public M81 c(@NotNull MatchResult matchResult, @NotNull String str) {
        Matcher matcher;
        int start;
        int end;
        String group;
        C6562gT0.p(matchResult, "matchResult");
        C6562gT0.p(str, "name");
        if (matchResult instanceof Matcher) {
            matcher = (Matcher) matchResult;
        } else {
            matcher = null;
        }
        if (matcher != null) {
            start = matcher.start(str);
            end = matcher.end(str);
            C11197zR0 c11197zR0 = new C11197zR0(start, end - 1);
            if (c11197zR0.d().intValue() >= 0) {
                group = matcher.group(str);
                C6562gT0.o(group, "group(...)");
                return new M81(group, c11197zR0);
            }
            return null;
        }
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    @Override // o.C8946qD1
    @InterfaceC5395bj0
    @NotNull
    public MD e() {
        if (f(26)) {
            return new b();
        }
        return new c();
    }

    public final boolean f(int i) {
        Integer num = a.b;
        if (num != null && num.intValue() < i) {
            return false;
        }
        return true;
    }
}
