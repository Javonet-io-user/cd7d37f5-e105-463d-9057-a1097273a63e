package Aspose.Tasks;

public enum TaskKey {
  Uid(0L),
  Id(1L),
  Name(2L),
  Type(3L),
  IsNull(4L),
  Created(5L),
  Contact(6L),
  WBS(7L),
  WBSLevel(8L),
  OutlineNumber(9L),
  OutlineLevel(10L),
  Priority(11L),
  Start(12L),
  Finish(13L),
  Duration(14L),
  DurationVariance(15L),
  DurationFormat(16L),
  Work(17L),
  Stop(18L),
  Resume(19L),
  IsResumeValid(20L),
  IsEffortDriven(21L),
  IsRecurring(22L),
  IsOverallocated(23L),
  IsEstimated(24L),
  IsMilestone(25L),
  IsCritical(26L),
  IsSubproject(27L),
  IsSubprojectReadOnly(28L),
  IsMarked(29L),
  IgnoreWarnings(30L),
  SubprojectName(31L),
  IsExternalTask(32L),
  IsSummary(33L),
  ExternalTaskProject(34L),
  ExternalId(35L),
  ExternalKey(36L),
  EarlyStart(37L),
  EarlyFinish(38L),
  LateStart(39L),
  LateFinish(40L),
  StartVariance(41L),
  FinishVariance(42L),
  WorkVariance(43L),
  CostVariance(44L),
  FreeSlack(45L),
  TotalSlack(46L),
  StartSlack(47L),
  FinishSlack(48L),
  FixedCost(49L),
  FixedCostAccrual(50L),
  PercentComplete(51L),
  PercentWorkComplete(52L),
  Cost(53L),
  OvertimeCost(54L),
  ActualStart(55L),
  ActualFinish(56L),
  ActualDuration(57L),
  ActualCost(58L),
  ActualOvertimeCost(59L),
  ActualWork(60L),
  ActualOvertimeWork(61L),
  OvertimeWork(62L),
  RegularWork(63L),
  RemainingDuration(64L),
  RemainingCost(65L),
  RemainingWork(66L),
  RemainingOvertimeWork(67L),
  RemainingOvertimeCost(68L),
  ACWP(69L),
  CV(70L),
  ConstraintType(71L),
  Calendar(72L),
  ConstraintDate(73L),
  Deadline(74L),
  LevelAssignments(75L),
  LevelingCanSplit(76L),
  LevelingDelay(77L),
  LevelingDelayFormat(78L),
  PreleveledStart(79L),
  PreleveledFinish(80L),
  Hyperlink(81L),
  HyperlinkAddress(82L),
  HyperlinkSubAddress(83L),
  IgnoreResourceCalendar(84L),
  HideBar(85L),
  IsRollup(86L),
  BCWS(87L),
  BCWP(88L),
  PhysicalPercentComplete(89L),
  EarnedValueMethod(90L),
  ActualWorkProtected(91L),
  ActualOvertimeWorkProtected(92L),
  IsPublished(93L),
  IsScheduled(94L),
  StatusManager(95L),
  CommitmentStart(96L),
  CommitmentFinish(97L),
  CommitmentType(98L),
  IsManual(99L),
  IsExpanded(100L),
  Guid(101L),
  NotesText(102L),
  NotesRTF(103L),
  ManualStart(104L),
  ManualFinish(105L),
  ManualDuration(106L),
  BudgetWork(107L),
  BudgetCost(108L),
  DisplayAsSummary(109L),
  SummaryProgress(110L),
  IsActive(111L),
  StartText(112L),
  FinishText(113L),
  DurationText(114L),
  CalendarUid(115L),
  ParentTaskUid(116L),
  DisplayOnTimeline(117L),
  TaskIsAssigned(118L),
  TaskOriginalStart(119L),
  TaskOriginalFinish(120L),
  IsShowBeforeProjectStartDateWarning(121L),
  ;
  private long numVal;

  TaskKey(long numVal) {
    this.numVal = numVal;
  }

  public long getNumVal() {
    return numVal;
  }
}