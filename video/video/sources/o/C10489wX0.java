package o;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: o.wX0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C10489wX0 {
    public ArrayList<PX0> a = new ArrayList<>();

    public void a(PX0 px0) {
        this.a.add(px0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.a.isEmpty()) {
            sb.append("keyFrames:{\n");
            Iterator<PX0> it = this.a.iterator();
            while (it.hasNext()) {
                sb.append(it.next().toString());
            }
            sb.append("},\n");
        }
        return sb.toString();
    }
}
