package o;

import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: o.ma  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8057ma {
    public static final /* synthetic */ EnumC8057ma[] k1;
    public static final /* synthetic */ InterfaceC3127Hd0 l1;
    public static final EnumC8057ma X = new EnumC8057ma("CLASS", 0);
    public static final EnumC8057ma Y = new EnumC8057ma("ANNOTATION_CLASS", 1);
    public static final EnumC8057ma Z = new EnumC8057ma("TYPE_PARAMETER", 2);
    public static final EnumC8057ma Y0 = new EnumC8057ma("PROPERTY", 3);
    public static final EnumC8057ma Z0 = new EnumC8057ma("FIELD", 4);
    public static final EnumC8057ma a1 = new EnumC8057ma("LOCAL_VARIABLE", 5);
    public static final EnumC8057ma b1 = new EnumC8057ma("VALUE_PARAMETER", 6);
    public static final EnumC8057ma c1 = new EnumC8057ma("CONSTRUCTOR", 7);
    public static final EnumC8057ma d1 = new EnumC8057ma("FUNCTION", 8);
    public static final EnumC8057ma e1 = new EnumC8057ma("PROPERTY_GETTER", 9);
    public static final EnumC8057ma f1 = new EnumC8057ma("PROPERTY_SETTER", 10);
    public static final EnumC8057ma g1 = new EnumC8057ma("TYPE", 11);
    public static final EnumC8057ma h1 = new EnumC8057ma("EXPRESSION", 12);
    public static final EnumC8057ma i1 = new EnumC8057ma("FILE", 13);
    @InterfaceC6480g82(version = "1.1")
    public static final EnumC8057ma j1 = new EnumC8057ma("TYPEALIAS", 14);

    static {
        EnumC8057ma[] e = e();
        k1 = e;
        l1 = C3323Jd0.c(e);
    }

    public EnumC8057ma(String str, int i) {
    }

    public static final /* synthetic */ EnumC8057ma[] e() {
        return new EnumC8057ma[]{X, Y, Z, Y0, Z0, a1, b1, c1, d1, e1, f1, g1, h1, i1, j1};
    }

    @NotNull
    public static InterfaceC3127Hd0<EnumC8057ma> g() {
        return l1;
    }

    public static EnumC8057ma valueOf(String str) {
        return (EnumC8057ma) Enum.valueOf(EnumC8057ma.class, str);
    }

    public static EnumC8057ma[] values() {
        return (EnumC8057ma[]) k1.clone();
    }
}
