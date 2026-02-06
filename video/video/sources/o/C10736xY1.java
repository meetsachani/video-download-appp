package o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.xY1 */
/* loaded from: classes2.dex */
public final class C10736xY1 extends SQLiteOpenHelper {
    public static final String Y0 = "CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)";
    public static final String Z = "com.google.android.datatransport.events";
    public static final String Z0 = "CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)";
    public static final String a1 = "CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)";
    public static final String b1 = "CREATE INDEX events_backend_id on events(context_id)";
    public static final String c1 = "CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)";
    public static final String d1 = "DROP TABLE events";
    public static final String e1 = "DROP TABLE event_metadata";
    public static final String f1 = "DROP TABLE transport_contexts";
    public static final String g1 = "CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))";
    public static final String h1 = "DROP TABLE IF EXISTS event_payloads";
    public static final String i1 = "CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))";
    public static final String j1 = "CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)";
    public static final String l1 = "DROP TABLE IF EXISTS log_event_dropped";
    public static final String m1 = "DROP TABLE IF EXISTS global_log_event_state";
    public static final a o1;
    public static final a p1;
    public static final a q1;
    public static final a r1;
    public static final a s1;
    public static final List<a> t1;
    public final int X;
    public boolean Y;
    public static final String k1 = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + C9811tl1.d;
    public static int n1 = 5;

    /* renamed from: o.xY1$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: o.sY1
            @Override // o.C10736xY1.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                C10736xY1.a(sQLiteDatabase);
            }
        };
        o1 = aVar;
        a aVar2 = new a() { // from class: o.tY1
            @Override // o.C10736xY1.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                C10736xY1.h(sQLiteDatabase);
            }
        };
        p1 = aVar2;
        a aVar3 = new a() { // from class: o.uY1
            @Override // o.C10736xY1.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                C10736xY1.d(sQLiteDatabase);
            }
        };
        q1 = aVar3;
        a aVar4 = new a() { // from class: o.vY1
            @Override // o.C10736xY1.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                C10736xY1.i(sQLiteDatabase);
            }
        };
        r1 = aVar4;
        a aVar5 = new a() { // from class: o.wY1
            @Override // o.C10736xY1.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                C10736xY1.f(sQLiteDatabase);
            }
        };
        s1 = aVar5;
        t1 = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    @RP0
    public C10736xY1(Context context, @InterfaceC10309vo1("SQLITE_DB_NAME") String str, @InterfaceC10309vo1("SCHEMA_VERSION") int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.Y = false;
        this.X = i;
    }

    public static /* synthetic */ void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(Y0);
        sQLiteDatabase.execSQL(Z0);
        sQLiteDatabase.execSQL(a1);
        sQLiteDatabase.execSQL(b1);
        sQLiteDatabase.execSQL(c1);
    }

    public static /* synthetic */ void d(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }

    public static /* synthetic */ void f(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(l1);
        sQLiteDatabase.execSQL(m1);
        sQLiteDatabase.execSQL(i1);
        sQLiteDatabase.execSQL(j1);
        sQLiteDatabase.execSQL(k1);
    }

    public static /* synthetic */ void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL(h1);
        sQLiteDatabase.execSQL(g1);
    }

    public final void j(SQLiteDatabase sQLiteDatabase) {
        if (!this.Y) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void k(SQLiteDatabase sQLiteDatabase, int i) {
        j(sQLiteDatabase);
        l(sQLiteDatabase, 0, i);
    }

    public final void l(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<a> list = t1;
        if (i2 <= list.size()) {
            while (i < i2) {
                t1.get(i).a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.Y = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        k(sQLiteDatabase, this.X);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL(d1);
        sQLiteDatabase.execSQL(e1);
        sQLiteDatabase.execSQL(f1);
        sQLiteDatabase.execSQL(h1);
        sQLiteDatabase.execSQL(l1);
        sQLiteDatabase.execSQL(m1);
        k(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        j(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        j(sQLiteDatabase);
        l(sQLiteDatabase, i, i2);
    }
}
