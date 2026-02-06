package o;

/* renamed from: o.kp0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC7614kp0 {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");
    
    public final String X;

    EnumC7614kp0(String str) {
        this.X = str;
    }

    public String g() {
        return ".temp" + this.X;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.X;
    }
}
