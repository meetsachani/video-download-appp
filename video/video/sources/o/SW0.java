package o;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public interface SW0 extends InterfaceC10972yW0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes3.dex */
    public static final class b {
        public static final /* synthetic */ b[] Y0;
        public static final /* synthetic */ InterfaceC3127Hd0 Z0;
        public static final b X = new b("INSTANCE", 0);
        public static final b Y = new b("EXTENSION_RECEIVER", 1);
        public static final b Z = new b("VALUE", 2);

        static {
            b[] e = e();
            Y0 = e;
            Z0 = C3323Jd0.c(e);
        }

        public b(String str, int i) {
        }

        public static final /* synthetic */ b[] e() {
            return new b[]{X, Y, Z};
        }

        @NotNull
        public static InterfaceC3127Hd0<b> g() {
            return Z0;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) Y0.clone();
        }
    }

    boolean Y();

    boolean f0();

    int getIndex();

    @Nullable
    String getName();

    @NotNull
    XW0 getType();

    @NotNull
    b n();

    /* loaded from: classes3.dex */
    public static final class a {
        @InterfaceC6480g82(version = "1.1")
        public static /* synthetic */ void a() {
        }
    }
}
