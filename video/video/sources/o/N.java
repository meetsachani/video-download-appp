package o;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes4.dex */
public abstract class N implements InterfaceC7507kN {
    public static final Object c = new Object();
    public static String[] d = new String[0];
    public Object a;
    public boolean b;

    public N() {
        this.a = null;
        this.b = false;
    }

    @Override // o.InterfaceC7507kN
    public abstract Object b(Class cls, Object obj);

    public List c(String str) {
        int nextToken;
        str.getClass();
        String trim = str.trim();
        if (trim.startsWith("{") && trim.endsWith("}")) {
            trim = trim.substring(1, trim.length() - 1);
        }
        try {
            StreamTokenizer streamTokenizer = new StreamTokenizer(new StringReader(trim));
            streamTokenizer.whitespaceChars(44, 44);
            streamTokenizer.ordinaryChars(48, 57);
            streamTokenizer.ordinaryChars(46, 46);
            streamTokenizer.ordinaryChars(45, 45);
            streamTokenizer.wordChars(48, 57);
            streamTokenizer.wordChars(46, 46);
            streamTokenizer.wordChars(45, 45);
            ArrayList arrayList = new ArrayList();
            while (true) {
                nextToken = streamTokenizer.nextToken();
                if (nextToken != -3 && nextToken <= 0) {
                    break;
                }
                arrayList.add(streamTokenizer.sval);
            }
            if (nextToken == -1) {
                return arrayList;
            }
            throw new WM("Encountered token of type " + nextToken);
        } catch (IOException e) {
            throw new WM(e);
        }
    }

    public N(Object obj) {
        this.a = null;
        this.b = true;
        if (obj == c) {
            this.b = false;
            return;
        }
        this.a = obj;
        this.b = true;
    }
}
