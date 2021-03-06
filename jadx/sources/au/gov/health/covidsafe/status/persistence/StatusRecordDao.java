package au.gov.health.covidsafe.status.persistence;

import androidx.lifecycle.LiveData;
import androidx.sqlite.db.SupportSQLiteQuery;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'J\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\n2\u0006\u0010\u000b\u001a\u00020\fH'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\nH'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\u0010H'J\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0012H'\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lau/gov/health/covidsafe/status/persistence/StatusRecordDao;", "", "deleteDataOlder", "", "timeInMs", "", "getCurrentRecords", "", "Lau/gov/health/covidsafe/status/persistence/StatusRecord;", "getMostRecentRecord", "Landroidx/lifecycle/LiveData;", "msg", "", "getRecords", "getRecordsViaQuery", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "insert", "", "record", "(Lau/gov/health/covidsafe/status/persistence/StatusRecord;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "nukeDb", "app_release"}, k = 1, mv = {1, 1, 16})
/* compiled from: StatusRecordDao.kt */
public interface StatusRecordDao {
    int deleteDataOlder(long j);

    List<StatusRecord> getCurrentRecords();

    LiveData<StatusRecord> getMostRecentRecord(String str);

    LiveData<List<StatusRecord>> getRecords();

    List<StatusRecord> getRecordsViaQuery(SupportSQLiteQuery supportSQLiteQuery);

    Object insert(StatusRecord statusRecord, Continuation<? super Unit> continuation);

    void nukeDb();
}
