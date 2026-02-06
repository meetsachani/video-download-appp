package o;

import o.C8255nN0;

/* renamed from: o.Qi  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4025Qi extends C8255nN0.a {
    public final int a;
    public final int b;

    public C4025Qi(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // o.C8255nN0.a
    public int b() {
        return this.b;
    }

    @Override // o.C8255nN0.a
    public int c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C8255nN0.a) {
            C8255nN0.a aVar = (C8255nN0.a) obj;
            if (this.a == aVar.c() && this.b == aVar.b()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        return "FormatCombo{imageCaptureFormat=" + this.a + ", imageAnalysisFormat=" + this.b + "}";
    }
}
