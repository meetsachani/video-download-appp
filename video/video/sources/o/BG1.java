package o;

import java.io.InputStream;
import o.CG1;

/* loaded from: classes.dex */
public final class BG1 {
    public static final a a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        public /* synthetic */ a(C9516sY c9516sY) {
            this();
        }

        public final CG1.b a(InputStream inputStream) {
            C6562gT0.p(inputStream, "input");
            try {
                CG1.b I2 = CG1.b.I2(inputStream);
                C6562gT0.o(I2, "{\n                PreferencesProto.PreferenceMap.parseFrom(input)\n            }");
                return I2;
            } catch (C9258rT0 e) {
                throw new BQ("Unable to parse preferences proto.", e);
            }
        }

        public a() {
        }
    }
}
