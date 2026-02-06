package o;

import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* renamed from: o.ri  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C9311ri extends AbstractC6133em {
    public final List<AbstractC4995a41> a;

    public C9311ri(List<AbstractC4995a41> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null logRequests");
    }

    @Override // o.AbstractC6133em
    @InterfaceC5670cr1
    @Encodable.Field(name = "logRequest")
    public List<AbstractC4995a41> c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC6133em) {
            return this.a.equals(((AbstractC6133em) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.a + "}";
    }
}
