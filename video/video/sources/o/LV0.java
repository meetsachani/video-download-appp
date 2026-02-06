package o;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

/* loaded from: classes3.dex */
public final class LV0 {
    public static DV0 d(Reader reader) throws GV0, WV0 {
        try {
            OV0 ov0 = new OV0(reader);
            DV0 e = e(ov0);
            if (!e.L() && ov0.I() != XV0.END_DOCUMENT) {
                throw new WV0("Did not consume the entire document.");
            }
            return e;
        } catch (IOException e2) {
            throw new GV0(e2);
        } catch (NumberFormatException | A71 e3) {
            throw new WV0(e3);
        }
    }

    public static DV0 e(OV0 ov0) throws GV0, WV0 {
        EnumC7572ke2 q = ov0.q();
        if (q == EnumC7572ke2.LEGACY_STRICT) {
            ov0.S(EnumC7572ke2.LENIENT);
        }
        try {
            try {
                return C4690Xd2.a(ov0);
            } catch (OutOfMemoryError | StackOverflowError e) {
                throw new KV0("Failed parsing JSON source: " + ov0 + " to Json", e);
            }
        } finally {
            ov0.S(q);
        }
    }

    public static DV0 f(String str) throws WV0 {
        return d(new StringReader(str));
    }

    @Deprecated
    @VP0(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    public DV0 a(Reader reader) throws GV0, WV0 {
        return d(reader);
    }

    @Deprecated
    @VP0(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseString(json)")
    public DV0 b(String str) throws WV0 {
        return f(str);
    }

    @Deprecated
    @VP0(imports = {"com.google.gson.JsonParser"}, replacement = "JsonParser.parseReader(json)")
    public DV0 c(OV0 ov0) throws GV0, WV0 {
        return e(ov0);
    }
}
