using Microsoft.EntityFrameworkCore;
using TasklyAPI.Models;

 


namespace TasklyAPI.Data
{
    public class ApplicationDbContext : DbContext
    {
        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : base(options) { }

        public DbSet<TaskModel> Tasks { get; set; }

    }
}
