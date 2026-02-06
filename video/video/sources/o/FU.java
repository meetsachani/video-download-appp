package o;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public interface FU extends CU {

    /* loaded from: classes2.dex */
    public interface a {
        FU a();
    }

    long a(OU ou) throws IOException;

    default Map<String, List<String>> b() {
        return Collections.EMPTY_MAP;
    }

    void close() throws IOException;

    @InterfaceC11300zs1
    Uri getUri();

    void s(InterfaceC4261Sr2 interfaceC4261Sr2);
}
