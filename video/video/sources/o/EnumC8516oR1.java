package o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@InterfaceC6086ea0
@InterfaceC10420wF0
/* renamed from: o.oR1  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class EnumC8516oR1 {
    public static final EnumC8516oR1 X = new a("EXPLICIT", 0);
    public static final EnumC8516oR1 Y = new EnumC8516oR1("REPLACED", 1) { // from class: o.oR1.b
        @Override // o.EnumC8516oR1
        public boolean g() {
            return false;
        }
    };
    public static final EnumC8516oR1 Z = new EnumC8516oR1("COLLECTED", 2) { // from class: o.oR1.c
        @Override // o.EnumC8516oR1
        public boolean g() {
            return true;
        }
    };
    public static final EnumC8516oR1 Y0 = new EnumC8516oR1("EXPIRED", 3) { // from class: o.oR1.d
        @Override // o.EnumC8516oR1
        public boolean g() {
            return true;
        }
    };
    public static final EnumC8516oR1 Z0 = new EnumC8516oR1("SIZE", 4) { // from class: o.oR1.e
        @Override // o.EnumC8516oR1
        public boolean g() {
            return true;
        }
    };
    public static final /* synthetic */ EnumC8516oR1[] a1 = e();

    /* renamed from: o.oR1$a */
    /* loaded from: classes3.dex */
    public enum a extends EnumC8516oR1 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // o.EnumC8516oR1
        public boolean g() {
            return false;
        }
    }

    public EnumC8516oR1(String str, int i) {
    }

    public static /* synthetic */ EnumC8516oR1[] e() {
        return new EnumC8516oR1[]{X, Y, Z, Y0, Z0};
    }

    public static EnumC8516oR1 valueOf(String str) {
        return (EnumC8516oR1) Enum.valueOf(EnumC8516oR1.class, str);
    }

    public static EnumC8516oR1[] values() {
        return (EnumC8516oR1[]) a1.clone();
    }

    public abstract boolean g();

    public /* synthetic */ EnumC8516oR1(String str, int i, a aVar) {
        this(str, i);
    }
}
