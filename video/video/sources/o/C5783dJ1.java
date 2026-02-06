package o;

import java.io.Serializable;

/* renamed from: o.dJ1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5783dJ1 implements Serializable {
    public long X;
    public long Y;

    public C5783dJ1(long j, long j2) {
        this.X = j;
        this.Y = j2;
    }

    public String toString() {
        return "Progress{currentBytes=" + this.X + ", totalBytes=" + this.Y + '}';
    }
}
