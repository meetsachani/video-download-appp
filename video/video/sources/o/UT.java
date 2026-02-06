package o;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class UT {
    public static CancellationSignal a() {
        return new CancellationSignal();
    }

    public static void b(InterfaceC10528wh2 interfaceC10528wh2) {
        ArrayList<String> arrayList = new ArrayList();
        Cursor u4 = interfaceC10528wh2.u4("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (u4.moveToNext()) {
            try {
                arrayList.add(u4.getString(0));
            } catch (Throwable th) {
                u4.close();
                throw th;
            }
        }
        u4.close();
        for (String str : arrayList) {
            if (str.startsWith("room_fts_content_sync_")) {
                interfaceC10528wh2.K0("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    @Deprecated
    public static Cursor c(VU1 vu1, InterfaceC11257zh2 interfaceC11257zh2, boolean z) {
        return d(vu1, interfaceC11257zh2, z, null);
    }

    public static Cursor d(VU1 vu1, InterfaceC11257zh2 interfaceC11257zh2, boolean z, CancellationSignal cancellationSignal) {
        int i;
        Cursor x = vu1.x(interfaceC11257zh2, cancellationSignal);
        if (z && (x instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) x;
            int count = abstractWindowedCursor.getCount();
            if (abstractWindowedCursor.hasWindow()) {
                i = abstractWindowedCursor.getWindow().getNumRows();
            } else {
                i = count;
            }
            if (i < count) {
                return C9982uS.a(abstractWindowedCursor);
            }
            return x;
        }
        return x;
    }

    public static int e(File file) throws IOException {
        Throwable th;
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            try {
                channel.tryLock(60L, 4L, true);
                channel.position(60L);
                if (channel.read(allocate) == 4) {
                    allocate.rewind();
                    int i = allocate.getInt();
                    channel.close();
                    return i;
                }
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            } catch (Throwable th2) {
                th = th2;
                fileChannel = channel;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
