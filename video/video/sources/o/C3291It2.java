package o;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: o.It2  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3291It2 {
    public View b;
    public final Map<String, Object> a = new HashMap();
    public final ArrayList<AbstractC5921dt2> c = new ArrayList<>();

    @Deprecated
    public C3291It2() {
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3291It2) {
            C3291It2 c3291It2 = (C3291It2) obj;
            if (this.b == c3291It2.b && this.a.equals(c3291It2.a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.b + "\n") + "    values:";
        for (String str2 : this.a.keySet()) {
            str = str + "    " + str2 + ": " + this.a.get(str2) + "\n";
        }
        return str;
    }

    public C3291It2(View view) {
        this.b = view;
    }
}
