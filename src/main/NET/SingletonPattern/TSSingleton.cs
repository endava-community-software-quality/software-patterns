namespace SingletonPattern
{
    /// <summary>
    /// Not quite as lazy, but thread-safe without using locks
    /// </summary>
    public sealed class TSSingleton
    {
        private static readonly TSSingleton instance = new TSSingleton();

        // Explicit static constructor to tell C# compiler
        // not to mark type as beforefieldinit
        static TSSingleton()
        {
        }

        private TSSingleton()
        {
        }

        public static TSSingleton Instance
        {
            get
            {
                return instance;
            }
        }
    }
}
