package o;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

/* renamed from: o.Ss  reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C4262Ss extends C3968Ps {
    public final Map<String, Integer> u1;

    public C4262Ss(Reader reader) throws IOException {
        super(reader);
        this.u1 = new HashMap();
        j0();
    }

    public final void j0() throws IOException {
        String[] Q = super.Q();
        for (int i = 0; i < Q.length; i++) {
            this.u1.put(Q[i], Integer.valueOf(i));
        }
    }

    public Map<String, String> k0() throws IOException, C5817dS {
        String[] M = M();
        if (M == null) {
            return null;
        }
        if (M.length == this.u1.size()) {
            HashMap hashMap = new HashMap(this.u1.size() * 2);
            for (Map.Entry<String, Integer> entry : this.u1.entrySet()) {
                if (entry.getValue().intValue() < M.length) {
                    hashMap.put(entry.getKey(), M[entry.getValue().intValue()]);
                }
            }
            return hashMap;
        }
        throw new IOException(String.format(ResourceBundle.getBundle(UI0.k, this.e1).getString("header.data.mismatch.with.line.number"), Long.valueOf(l()), Integer.valueOf(this.u1.size()), Integer.valueOf(M.length)));
    }

    public String[] l0(String... strArr) throws IOException, C5817dS {
        if (strArr == null) {
            return super.Q();
        }
        String[] M = M();
        if (M == null) {
            return null;
        }
        if (M.length == this.u1.size()) {
            String[] strArr2 = new String[strArr.length];
            for (int i = 0; i < strArr.length; i++) {
                String str = strArr[i];
                Integer num = this.u1.get(str);
                if (num != null) {
                    strArr2[i] = M[num.intValue()];
                } else {
                    throw new IllegalArgumentException(String.format(ResourceBundle.getBundle(UI0.k, this.e1).getString("header.nonexistant"), str));
                }
            }
            return strArr2;
        }
        throw new IOException(String.format(ResourceBundle.getBundle(UI0.k, this.e1).getString("header.data.mismatch.with.line.number"), Long.valueOf(l()), Integer.valueOf(this.u1.size()), Integer.valueOf(M.length)));
    }

    public C4262Ss(Reader reader, int i, UI0 ui0, boolean z, boolean z2, int i2, Locale locale, C5707d01 c5707d01, C10970yV1 c10970yV1, InterfaceC9752tV1 interfaceC9752tV1) throws IOException {
        super(reader, i, ui0, z, z2, i2, locale, c5707d01, c10970yV1, interfaceC9752tV1);
        this.u1 = new HashMap();
        j0();
    }
}
