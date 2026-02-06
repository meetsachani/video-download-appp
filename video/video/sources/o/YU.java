package o;

import android.database.SQLException;
import java.io.IOException;

@Deprecated
/* loaded from: classes2.dex */
public final class YU extends IOException {
    public YU(SQLException sQLException) {
        super(sQLException);
    }

    public YU(SQLException sQLException, String str) {
        super(str, sQLException);
    }
}
